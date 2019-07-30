/**
 * Created by zhouyuan on 2018/1/18.
 */
public class ModCommon {
    public static Boolean IsEmptyVar(Object input) {
        return input == null || input.toString().equals("");

    }

    public static Boolean IsCommonPassengerEmptyVar(Object input) {
        return input == null || input.toString().equals("") || Ns(input).equalsIgnoreCase("Delete_Flag");

    }

    public static String Ns(Object input) {
        if (IsEmptyVar(input))
            return "";
        else
            return input.toString();
    }


}
