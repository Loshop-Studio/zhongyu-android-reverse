.class public final synthetic Lx2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/ShareBaseFileFragment;

.field public final synthetic b:Lcom/friday/document/databinding/PopSortBinding;

.field public final synthetic c:Landroid/widget/PopupWindow;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/e;->a:Lcom/friday/document/view/share/ShareBaseFileFragment;

    iput-object p2, p0, Lx2/e;->b:Lcom/friday/document/databinding/PopSortBinding;

    iput-object p3, p0, Lx2/e;->c:Landroid/widget/PopupWindow;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/e;->a:Lcom/friday/document/view/share/ShareBaseFileFragment;

    iget-object v1, p0, Lx2/e;->b:Lcom/friday/document/databinding/PopSortBinding;

    iget-object v2, p0, Lx2/e;->c:Landroid/widget/PopupWindow;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->r(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/PopupWindow;Landroid/widget/RadioGroup;I)V

    return-void
.end method
