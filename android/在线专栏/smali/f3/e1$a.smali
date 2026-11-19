.class public final Lf3/e1$a;
.super Lq2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq2/b<",
        "Lf3/e0;",
        "Lf3/e1;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lf3/e0;->a:Lf3/e0$a;

    .line 2
    sget-object v1, Lf3/e1$a$a;->a:Lf3/e1$a$a;

    .line 3
    invoke-direct {p0, v0, v1}, Lq2/b;-><init>(Lq2/g$c;Lx2/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lf3/e1$a;-><init>()V

    return-void
.end method
