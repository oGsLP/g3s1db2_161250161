package model;

/**
 * @你大爷: XYF
 * @author: lenovo XYF
 * @Date: 2018/10/27
 * @Time: 13:45
 * @Package: model
 */
public class User {

    private int id;
    private String username;
    private String password;
    private String cellphone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
//各种setter和getter

}