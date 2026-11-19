.class public abstract Ls4/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f;


# direct methods
.method public static a()Ll8/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/provide/OkHttpClientProvide;->INSTANCE:Lcom/zykj/study/provide/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/study/provide/OkHttpClientProvide;->provideUnauthorizedFlow()Ll8/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ll6/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ll8/g;

    .line 12
    .line 13
    return-object v0
.end method
