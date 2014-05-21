package org.jenkinsci.test.acceptance.po;

/**
 * Configuration fragment for computer launcher.
 *
 * Use {@link Describable} annotation to register an implementation.
 *
 * @author Kohsuke Kawaguchi
 */
public abstract class ComputerConnector extends PageArea {
    protected ComputerConnector(PageObject context, String path) {
        super(context, path);
    }
}
