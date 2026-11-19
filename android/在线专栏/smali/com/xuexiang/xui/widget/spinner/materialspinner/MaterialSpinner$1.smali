.class Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$000(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)I

    move-result p1

    if-lt p3, p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$100(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result p1

    if-ge p3, p1, :cond_0

    add-int/lit8 p3, p3, 0x1

    :cond_0
    move v2, p3

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1, v2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$002(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;I)I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$202(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)Z

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$100(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$100(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->notifyItemSelected(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->collapse()V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$300(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$300(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    move-wide v3, p4

    invoke-interface/range {v0 .. v5}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;->onItemSelected(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;IJLjava/lang/Object;)V

    :cond_1
    return-void
.end method
