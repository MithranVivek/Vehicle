package com.I5.Interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimeOut {
	
	 public static void main(String[] args) {
	        ExecutorService executor = Executors.newSingleThreadExecutor();

	        // Submit the task to the executor
	        Future<String> future = executor.submit(new Task());

	        try {
	            // Wait for the result with a timeout of 10 seconds
	            String result = future.get(10, TimeUnit.SECONDS);
	            System.out.println("Result: " + result);
	        } catch (TimeoutException e) {
	            // The task didn't complete within the specified timeout
	            System.out.println("Timeout occurred. Task is taking too long.");
	            // You can cancel the task if necessary
	            future.cancel(true);
	        } catch (InterruptedException | ExecutionException e) {
	            // Other exceptions occurred
	            e.printStackTrace();
	        }

	        // Shutdown the executor
	        executor.shutdown();
	    }

	    static class Task implements Callable<String> {
	        @Override
	        public String call() throws Exception {
	            // Simulate a long-running task
	            Thread.sleep(15000);
	            return "Task completed successfully!";
	        }
	    }

}
