package zubkov.appliances;

import zubkov.appliances.exceptions.PlugException;

public interface Pluggable {
    void plugIn() throws PlugException;
    void plugOut() throws PlugException;
}
