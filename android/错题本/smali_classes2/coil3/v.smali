.class public abstract synthetic Lcoil3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lcoil3/r;
    .locals 3

    .line 1
    new-instance v0, Lb0/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb0/g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, v0, Lb0/g;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lcoil3/i;

    .line 9
    .line 10
    sget-object v1, Lcoil3/w;->a:Lo2/a;

    .line 11
    .line 12
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    iget-object p0, p0, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lb0/g;->b()Lcoil3/r;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
