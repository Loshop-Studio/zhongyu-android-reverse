.class public abstract Lcoil3/util/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld6/e;

.field public static final b:Ld6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/k;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/lifecycle/k;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcoil3/util/j;->a:Ld6/e;

    .line 13
    .line 14
    new-instance v0, Landroidx/lifecycle/k;

    .line 15
    .line 16
    const/16 v1, 0xb

    .line 17
    .line 18
    invoke-direct {v0, v1}, Landroidx/lifecycle/k;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcoil3/util/j;->b:Ld6/e;

    .line 26
    .line 27
    return-void
.end method
