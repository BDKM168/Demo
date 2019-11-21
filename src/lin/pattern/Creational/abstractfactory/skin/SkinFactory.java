package lin.pattern.Creational.abstractfactory.skin;

public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
