.class public final synthetic Lk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/update/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/update/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/a;->a:Lcom/zykj/subscriber/update/c;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lk2/a;->a:Lcom/zykj/subscriber/update/c;

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/subscriber/update/c;->a(Lcom/zykj/subscriber/update/c;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
