.class public final synthetic Lj4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj4/k;

.field public final synthetic b:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Lj4/k;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/j;->a:Lj4/k;

    iput-object p2, p0, Lj4/j;->b:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj4/j;->a:Lj4/k;

    iget-object v1, p0, Lj4/j;->b:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lj4/k;->c(Lj4/k;Landroid/graphics/Rect;)V

    return-void
.end method
