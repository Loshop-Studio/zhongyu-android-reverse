.class public final enum Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

.field public static final enum DARK:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

.field public static final enum LIGHT:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->LIGHT:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    const-string v3, "DARK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->DARK:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->$VALUES:[Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->$VALUES:[Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    return-object v0
.end method
