.class public final enum Lcom/zykj/study/bean/course/CourseType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/study/bean/course/CourseType;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/zykj/study/bean/course/CourseType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/course/CourseType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum DELETE:Lcom/zykj/study/bean/course/CourseType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "2"
    .end annotation
.end field

.field public static final enum GROUNDING:Lcom/zykj/study/bean/course/CourseType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "1"
    .end annotation
.end field

.field public static final enum UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "0"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/zykj/study/bean/course/CourseType;
    .locals 3

    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    sget-object v1, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    sget-object v2, Lcom/zykj/study/bean/course/CourseType;->DELETE:Lcom/zykj/study/bean/course/CourseType;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/study/bean/course/CourseType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/bean/course/CourseType;

    .line 2
    .line 3
    const-string v1, "UNDERCARRIAGE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/course/CourseType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/study/bean/course/CourseType;

    .line 12
    .line 13
    const-string v1, "GROUNDING"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/course/CourseType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/study/bean/course/CourseType;

    .line 22
    .line 23
    const-string v1, "DELETE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/bean/course/CourseType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->DELETE:Lcom/zykj/study/bean/course/CourseType;

    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/study/bean/course/CourseType;->$values()[Lcom/zykj/study/bean/course/CourseType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->$VALUES:[Lcom/zykj/study/bean/course/CourseType;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lp7/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->$ENTRIES:Lp7/a;

    .line 42
    .line 43
    new-instance v0, Lcom/zykj/study/bean/course/CourseType$Creator;

    .line 44
    .line 45
    invoke-direct {v0}, Lcom/zykj/study/bean/course/CourseType$Creator;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/zykj/study/bean/course/CourseType;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 49
    .line 50
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getEntries()Lp7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp7/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->$ENTRIES:Lp7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/study/bean/course/CourseType;
    .locals 1

    const-class v0, Lcom/zykj/study/bean/course/CourseType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/bean/course/CourseType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/study/bean/course/CourseType;
    .locals 1

    sget-object v0, Lcom/zykj/study/bean/course/CourseType;->$VALUES:[Lcom/zykj/study/bean/course/CourseType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/study/bean/course/CourseType;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
