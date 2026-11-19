.class public final synthetic Lh4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lh4/d;


# direct methods
.method public synthetic constructor <init>(Lh4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/c;->a:Lh4/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/c;->a:Lh4/d;

    invoke-static {v0, p1}, Lh4/d;->c(Lh4/d;Landroid/view/View;)V

    return-void
.end method
