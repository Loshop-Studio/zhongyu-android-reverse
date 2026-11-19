.class public final Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/os/ParcelableCompatCreatorCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;
    .locals 1

    .line 1
    new-instance v0, Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(I)[Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;
    .locals 0

    .line 1
    new-array p1, p1, [Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState$a;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState$a;->b(I)[Lfr/castorflex/android/verticalviewpager/VerticalViewPager$SavedState;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
