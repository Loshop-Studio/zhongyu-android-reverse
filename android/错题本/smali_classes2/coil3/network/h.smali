.class public abstract Lcoil3/network/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo2/a;

.field public static final b:Lo2/a;

.field public static final c:Lo2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lo2/a;

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcoil3/network/h;->a:Lo2/a;

    .line 10
    .line 11
    new-instance v0, Lo2/a;

    .line 12
    .line 13
    sget-object v1, Lcoil3/network/k;->b:Lcoil3/network/k;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcoil3/network/h;->b:Lo2/a;

    .line 19
    .line 20
    new-instance v0, Lo2/a;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcoil3/network/h;->c:Lo2/a;

    .line 27
    .line 28
    return-void
.end method
