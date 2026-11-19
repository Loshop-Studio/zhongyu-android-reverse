.class public final synthetic Lcom/zykj/subscriber/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lx0/w;

.field public final synthetic b:Lx0/p;


# direct methods
.method public synthetic constructor <init>(Lx0/w;Lx0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/subscriber/b;->a:Lx0/w;

    iput-object p2, p0, Lcom/zykj/subscriber/b;->b:Lx0/p;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/zykj/subscriber/b;->a:Lx0/w;

    iget-object v1, p0, Lcom/zykj/subscriber/b;->b:Lx0/p;

    invoke-static {v0, v1, p1}, Lcom/zykj/subscriber/MainActivity$d;->i(Lx0/w;Lx0/p;Landroid/content/DialogInterface;)V

    return-void
.end method
