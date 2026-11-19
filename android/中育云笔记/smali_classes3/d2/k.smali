.class public abstract Ld2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# direct methods
.method public static a(Lje/v;)Ld2/i;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/di/OkHttpClientProvide;->INSTANCE:Lcom/friday/common/di/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/friday/common/di/OkHttpClientProvide;->provideEzyService(Lje/v;)Ld2/i;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lgc/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ld2/i;

    .line 12
    .line 13
    return-object p0
.end method
