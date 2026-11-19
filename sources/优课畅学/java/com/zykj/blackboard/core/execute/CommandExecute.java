package com.zykj.blackboard.core.execute;

/* loaded from: classes4.dex */
public interface CommandExecute<T> {
    PlayThread asyncExecute(T t10, long j10);

    void execute(T t10);
}
