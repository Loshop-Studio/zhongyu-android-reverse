.class public abstract Ld2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# direct methods
.method public static a()Lvd/l;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/di/OkHttpClientProvide;->INSTANCE:Lcom/friday/common/di/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/di/OkHttpClientProvide;->provideHeaderBeanFlow()Lvd/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lgc/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lvd/l;

    .line 12
    .line 13
    return-object v0
.end method
