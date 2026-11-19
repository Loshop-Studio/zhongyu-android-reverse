.class Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;->emptyRatingBar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

.field final synthetic val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$1;->this$0:Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$1;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$1;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->setEmpty()V

    return-void
.end method
