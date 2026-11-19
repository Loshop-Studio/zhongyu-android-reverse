.class public final synthetic Lj9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/r$c;


# instance fields
.field public final synthetic a:Li9/r;


# direct methods
.method public synthetic constructor <init>(Li9/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/i;->a:Li9/r;

    return-void
.end method


# virtual methods
.method public final a(Li9/e;)Li9/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lj9/i;->a:Li9/r;

    invoke-static {v0, p1}, Lj9/k;->b(Li9/r;Li9/e;)Li9/r;

    move-result-object p1

    return-object p1
.end method
