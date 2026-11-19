.class public final synthetic Lv2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/document/FolderFragment;

.field public final synthetic b:Landroid/widget/PopupWindow;

.field public final synthetic c:Lcom/friday/document/databinding/PopSortBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/u;->a:Lcom/friday/document/view/document/FolderFragment;

    iput-object p2, p0, Lv2/u;->b:Landroid/widget/PopupWindow;

    iput-object p3, p0, Lv2/u;->c:Lcom/friday/document/databinding/PopSortBinding;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv2/u;->a:Lcom/friday/document/view/document/FolderFragment;

    iget-object v1, p0, Lv2/u;->b:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lv2/u;->c:Lcom/friday/document/databinding/PopSortBinding;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/friday/document/view/document/FolderFragment;->a0(Lcom/friday/document/view/document/FolderFragment;Landroid/widget/PopupWindow;Lcom/friday/document/databinding/PopSortBinding;Landroid/widget/RadioGroup;I)V

    return-void
.end method
