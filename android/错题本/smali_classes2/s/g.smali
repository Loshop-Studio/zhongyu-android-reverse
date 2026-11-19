.class public abstract Ls/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo2/a;

.field public static final b:Lo2/a;

.field public static final c:Lo2/a;

.field public static final d:Lo2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lo2/a;

    .line 2
    .line 3
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls/g;->a:Lo2/a;

    .line 10
    .line 11
    new-instance v0, Lo2/a;

    .line 12
    .line 13
    new-instance v1, Lt/f;

    .line 14
    .line 15
    const/16 v2, 0x1000

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/collections/u;->b(I)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lt/a;

    .line 21
    .line 22
    invoke-direct {v3, v2}, Lt/a;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/collections/u;->b(I)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lt/a;

    .line 29
    .line 30
    invoke-direct {v4, v2}, Lt/a;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v3, v4}, Lt/f;-><init>(Lt/c;Lt/c;)V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x6

    .line 37
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Ls/g;->b:Lo2/a;

    .line 41
    .line 42
    new-instance v0, Lo2/a;

    .line 43
    .line 44
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ls/g;->c:Lo2/a;

    .line 50
    .line 51
    new-instance v0, Lo2/a;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Ls/g;->d:Lo2/a;

    .line 59
    .line 60
    return-void
.end method
