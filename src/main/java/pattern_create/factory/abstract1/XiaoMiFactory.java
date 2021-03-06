package src.main.java.pattern_create.factory.abstract1;

public class XiaoMiFactory implements IProductFactory{
    @Override
    public IPhoneProduct getPhoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct getRouterProduct() {
        return new XiaoMiRouter();
    }

    @Override
    public IComputerProduct getComputerProduct() {
        return null;
    }
}
