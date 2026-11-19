.class public final Lcom/zykj/study/bean/course/CourseSimpleBean$CREATOR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/bean/course/CourseSimpleBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CREATOR"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/study/bean/course/CourseSimpleBean;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/bean/course/CourseSimpleBean$CREATOR;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/zykj/study/bean/course/CourseSimpleBean;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/zykj/study/bean/course/CourseSimpleBean;

    invoke-direct {v0, p1}, Lcom/zykj/study/bean/course/CourseSimpleBean;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/bean/course/CourseSimpleBean$CREATOR;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/study/bean/course/CourseSimpleBean;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/zykj/study/bean/course/CourseSimpleBean;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/zykj/study/bean/course/CourseSimpleBean;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/bean/course/CourseSimpleBean$CREATOR;->newArray(I)[Lcom/zykj/study/bean/course/CourseSimpleBean;

    move-result-object p1

    return-object p1
.end method
