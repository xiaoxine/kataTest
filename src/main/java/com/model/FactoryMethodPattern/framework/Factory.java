package com.model.FactoryMethodPattern.framework;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:30
 * @Description: 在framework包中的Factory类，我们使用了Template Method模式。
 * 该类还声明了用于“生成产品”的createProduct抽象方法和用于“注册产品”的registerProduct 抽象方法。
 * @Version: 1.1
 */
public abstract class Factory {
    /**
     * 在这个框架中，我们定义了工厂是用来“调用create方法生成Product实例”的。
     * 而create方法的实现是先调用createProduct生成产品，接着调用registerProduct注册产品。
     * @param owner
     * @return
     */
    public final Product create(String owner){
        Product p =createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * “生成产品”和“注册产品”的具体处理则被交给了Factory类的子类负责。
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
