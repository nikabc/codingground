import java.io.*;

class FileWorkerA
{
    private String fileName;
    private boolean first = true;
    
    FileWorkerA(String fileName_) {
        fileName = fileName_;
        zero();
    }
    
    private void zero()
    {
        try {
            File file = new File(fileName);
            if(file.exists())
            {
                if(true)
                {
                    FileWriter wrt = new FileWriter(file, false);
                    try {
                        wrt.write("");
                    } finally {
                        wrt.close();
                    }
                }
                else
                {
                    file.delete();
                    file.createNewFile();
                }
                //throw new RuntimeException("test");
            }
            else {
                file.createNewFile();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void write(String text) 
    {
        File file = new File(fileName);
     
        try {
            FileWriter wrt = new FileWriter(file, true);
     
            try {
                wrt.write(text);
            } finally {
                wrt.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
