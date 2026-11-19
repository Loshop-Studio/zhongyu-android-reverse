.class public abstract Le5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/blankj/utilcode/util/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Study"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/z;->f(Ljava/lang/String;)Lcom/blankj/utilcode/util/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Le5/n;->a:Lcom/blankj/utilcode/util/z;

    .line 8
    .line 9
    return-void
.end method

.method public static final a()J
    .locals 2

    .line 1
    sget-object v0, Le5/n;->a:Lcom/blankj/utilcode/util/z;

    .line 2
    .line 3
    const-string v1, "USER_ID"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/z;->j(Ljava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final b(J)V
    .locals 2

    .line 1
    sget-object v0, Le5/n;->a:Lcom/blankj/utilcode/util/z;

    .line 2
    .line 3
    const-string v1, "USER_ID"

    .line 4
    .line 5
    invoke-virtual {v0, v1, p0, p1}, Lcom/blankj/utilcode/util/z;->s(Ljava/lang/String;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
