.class public final synthetic Lg5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/r$c;


# instance fields
.field public final synthetic a:Lf5/r;


# direct methods
.method public synthetic constructor <init>(Lf5/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/i;->a:Lf5/r;

    return-void
.end method


# virtual methods
.method public final a(Lf5/e;)Lf5/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/i;->a:Lf5/r;

    invoke-static {v0, p1}, Lg5/k;->b(Lf5/r;Lf5/e;)Lf5/r;

    move-result-object p1

    return-object p1
.end method
