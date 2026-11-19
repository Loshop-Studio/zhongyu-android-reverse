.class public final synthetic Lu5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lu5/d;


# direct methods
.method public synthetic constructor <init>(Lu5/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/b;->a:Lu5/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/b;->a:Lu5/d;

    invoke-static {v0, p1}, Lu5/d;->c(Lu5/d;Landroid/view/View;)V

    return-void
.end method
