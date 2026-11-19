.class public interface abstract Lf3/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf3/m1$b;,
        Lf3/m1$a;
    }
.end annotation


# static fields
.field public static final P:Lf3/m1$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf3/m1$b;->a:Lf3/m1$b;

    sput-object v0, Lf3/m1;->P:Lf3/m1$b;

    return-void
.end method


# virtual methods
.method public abstract B(Ljava/util/concurrent/CancellationException;)V
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract a(Lf3/s;)Lf3/q;
    .param p1    # Lf3/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isActive()Z
.end method

.method public abstract r(ZZLx2/l;)Lf3/w0;
    .param p3    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)",
            "Lf3/w0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract start()Z
.end method

.method public abstract u()Ljava/util/concurrent/CancellationException;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
