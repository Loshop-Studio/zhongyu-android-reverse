.class public abstract Lcoil3/p;
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
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcoil3/p;->a:Lo2/a;

    .line 13
    .line 14
    new-instance v0, Lo2/a;

    .line 15
    .line 16
    sget-object v1, Lcoil3/decode/m;->a:Lcoil3/decode/m;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcoil3/p;->b:Lo2/a;

    .line 22
    .line 23
    new-instance v0, Lo2/a;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcoil3/p;->c:Lo2/a;

    .line 31
    .line 32
    return-void
.end method
