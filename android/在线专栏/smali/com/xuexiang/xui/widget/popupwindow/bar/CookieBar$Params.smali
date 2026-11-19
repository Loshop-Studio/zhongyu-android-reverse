.class final Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Params"
.end annotation


# instance fields
.field public action:Ljava/lang/String;

.field public actionColor:I

.field public actionIcon:I

.field public backgroundColor:I

.field public duration:J

.field public iconResId:I

.field public layoutGravity:I

.field public message:Ljava/lang/String;

.field public messageColor:I

.field public onActionClickListener:Landroid/view/View$OnClickListener;

.field public title:Ljava/lang/String;

.field public titleColor:I


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x7d0

    .line 2
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->duration:J

    const/16 v0, 0x30

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->layoutGravity:I

    return-void
.end method
