.class Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private rating:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState$1;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState$1;-><init>()V

    sput-object v0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->rating:F

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public getRating()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->rating:F

    return v0
.end method

.method public setRating(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->rating:F

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->rating:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
