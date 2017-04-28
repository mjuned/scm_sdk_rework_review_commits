package com.devfactory.scminsights;

public class Message {

  /**
   * Error Message Constants
   *
   */
  public interface ErrorMessage {
    String NO_TEST_RUN_FOUND = "No test run found for the provided testRunid: %s";

    String NAME_NOT_NULL = "Search name can't be empty..";

    String NO_CLASS_FOUND = "Class not found for the given name: %s";

    String NO_PROJECT_FOUND = "Project not found for provided id: %s";

    String NO_PACKAGE_FOUND = "Package not found for provided id: %s and name: %s";
    
    String NO_COMMIT_FOUND = "Commit not found for provided id: %s and name: %s";
  }
  
  public void update(){
    
  }
}
