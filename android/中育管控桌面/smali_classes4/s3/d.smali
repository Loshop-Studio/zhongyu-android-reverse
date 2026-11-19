.class public interface abstract Ls3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/d$a;
    }
.end annotation


# static fields
.field public static final a0:Ls3/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ls3/d$a;->a:Ls3/d$a;

    .line 2
    .line 3
    sput-object v0, Ls3/d;->a0:Ls3/d$a;

    .line 4
    .line 5
    return-void
.end method

.method public static synthetic a(Ls3/d;ILandroid/os/Bundle;Landroidx/navigation/NavOptions;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    sget-object p3, Ls3/d;->a0:Ls3/d$a;

    .line 13
    .line 14
    invoke-virtual {p3}, Ls3/d$a;->d()Landroidx/navigation/NavOptions;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :cond_1
    invoke-interface {p0, p1, p2, p3}, Ls3/d;->d(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: navigate"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method


# virtual methods
.method public abstract d(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V
.end method
