.class public Lcom/tencent/liteav/beauty/a;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/beauty/a$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/liteav/beauty/a$a;


# virtual methods
.method public setID(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/liteav/beauty/a;->a:Lcom/tencent/liteav/beauty/a$a;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/tencent/liteav/beauty/a$a;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v0, 0xbb9

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
