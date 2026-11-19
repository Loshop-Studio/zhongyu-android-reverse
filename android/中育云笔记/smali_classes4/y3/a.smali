.class public final synthetic Ly3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/d;


# instance fields
.field public final synthetic a:Lcom/friday/paint/adapter/OptionsListAdapter;

.field public final synthetic b:Lcom/friday/paint/adapter/OptionsAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/a;->a:Lcom/friday/paint/adapter/OptionsListAdapter;

    iput-object p2, p0, Ly3/a;->b:Lcom/friday/paint/adapter/OptionsAdapter;

    return-void
.end method


# virtual methods
.method public final a(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly3/a;->a:Lcom/friday/paint/adapter/OptionsListAdapter;

    iget-object v1, p0, Ly3/a;->b:Lcom/friday/paint/adapter/OptionsAdapter;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/friday/paint/adapter/OptionsListAdapter;->i(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method
