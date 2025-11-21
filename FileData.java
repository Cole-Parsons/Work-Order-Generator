 /**
 * File Data interface
 * Structure for producing a CSV
 */

public interface FileData {
   /**
     * Returns a comma-separated representation of the object's data suitable for file output.
     * @return CSV formatted string
     */
    String getFileData();
    
}
