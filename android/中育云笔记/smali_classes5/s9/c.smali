.class public abstract Ls9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/c$d;,
        Ls9/c$e;,
        Ls9/c$a;,
        Ls9/c$g;,
        Ls9/c$f;,
        Ls9/c$b;,
        Ls9/c$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ls9/c;->a:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Ls9/c;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Ls9/c;-><init>(Ljava/lang/String;ZLkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls9/c;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls9/c;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ls9/c;->b:Z

    .line 2
    .line 3
    return-void
.end method
