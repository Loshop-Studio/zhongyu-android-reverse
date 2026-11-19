.class public final synthetic Lc2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/f;->a:Lcom/zykj/subscriber/MainActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lc2/f;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0, p1, p2}, Lcom/zykj/subscriber/MainActivity;->i(Lcom/zykj/subscriber/MainActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
