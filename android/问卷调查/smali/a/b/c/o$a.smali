.class public La/b/c/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/h/j/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b/c/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/b/c/o;


# direct methods
.method public constructor <init>(La/b/c/o;)V
    .locals 0

    iput-object p1, p0, La/b/c/o$a;->b:La/b/c/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, La/b/c/o$a;->b:La/b/c/o;

    invoke-virtual {v0, p1}, La/b/c/o;->c(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
