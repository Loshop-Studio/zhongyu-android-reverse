.class public final enum Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

.field public static final enum ALL:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

.field public static final enum DATE:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

.field public static final enum DEFAULT:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

.field public static final enum TIME:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;


# instance fields
.field private final mType:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    const/4 v1, 0x6

    new-array v2, v1, [Z

    fill-array-data v2, :array_0

    const-string v3, "DEFAULT"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v2}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;-><init>(Ljava/lang/String;I[Z)V

    sput-object v0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->DEFAULT:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    .line 2
    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    new-array v3, v1, [Z

    fill-array-data v3, :array_1

    const-string v5, "ALL"

    const/4 v6, 0x1

    invoke-direct {v2, v5, v6, v3}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;-><init>(Ljava/lang/String;I[Z)V

    sput-object v2, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->ALL:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    new-array v5, v1, [Z

    fill-array-data v5, :array_2

    const-string v7, "TIME"

    const/4 v8, 0x2

    invoke-direct {v3, v7, v8, v5}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;-><init>(Ljava/lang/String;I[Z)V

    sput-object v3, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->TIME:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    .line 4
    new-instance v5, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    new-array v1, v1, [Z

    fill-array-data v1, :array_3

    const-string v7, "DATE"

    const/4 v9, 0x3

    invoke-direct {v5, v7, v9, v1}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;-><init>(Ljava/lang/String;I[Z)V

    sput-object v5, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->DATE:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    aput-object v0, v1, v4

    aput-object v2, v1, v6

    aput-object v3, v1, v8

    aput-object v5, v1, v9

    .line 5
    sput-object v1, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->$VALUES:[Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x0t
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;I[Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->mType:[Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->$VALUES:[Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    return-object v0
.end method


# virtual methods
.method public getType()[Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->mType:[Z

    return-object v0
.end method
