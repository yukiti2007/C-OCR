/**
 * Created by zhouyuan on 2018/4/11.
 */
public class ENV {

    private String _key;
    private String _value;

    public ENV(String key, String value) {

        _key = key;

        _value = value;

    }

    public String get_key() {
        return _key;
    }

    public void set_key(String _key) {
        this._key = _key;
    }

    public String get_value() {
        return _value;
    }

    public void set_value(String _value) {
        this._value = _value;
    }
}
