class inputInfo
{
    public int test_integer;
    public String test_string;
}

class inputCollector
{
    public void doInput(inputInfo info)
    {
        System.out.println("doInput");
        System.out.println(info.test_integer);
        System.out.println(info.test_string);
    }
}
