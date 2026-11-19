.class Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$LayoutParamConfig;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->addTo(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;->this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfig(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;->this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->access$000(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)I

    move-result v0

    iput v0, p1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$2;->this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->access$100(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;)I

    move-result v0

    iput v0, p1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    return-object p1
.end method
