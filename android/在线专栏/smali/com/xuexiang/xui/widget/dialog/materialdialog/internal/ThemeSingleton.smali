.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static singleton:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;


# instance fields
.field public backgroundColor:I

.field public btnSelectorNegative:I

.field public btnSelectorNeutral:I

.field public btnSelectorPositive:I

.field public btnSelectorStacked:I

.field public btnStackedGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public buttonsGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public contentColor:I

.field public contentGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public darkTheme:Z

.field public dividerColor:I

.field public icon:Landroid/graphics/drawable/Drawable;

.field public itemColor:I

.field public itemsGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public linkColor:Landroid/content/res/ColorStateList;

.field public listSelector:I

.field public negativeColor:Landroid/content/res/ColorStateList;

.field public neutralColor:Landroid/content/res/ColorStateList;

.field public positiveColor:Landroid/content/res/ColorStateList;

.field public titleColor:I

.field public titleGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public widgetColor:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->darkTheme:Z

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->titleColor:I

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->contentColor:I

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->positiveColor:Landroid/content/res/ColorStateList;

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->neutralColor:Landroid/content/res/ColorStateList;

    .line 7
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->negativeColor:Landroid/content/res/ColorStateList;

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->widgetColor:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->itemColor:I

    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->icon:Landroid/graphics/drawable/Drawable;

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->backgroundColor:I

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->dividerColor:I

    .line 13
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->linkColor:Landroid/content/res/ColorStateList;

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->listSelector:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->btnSelectorStacked:I

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->btnSelectorPositive:I

    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->btnSelectorNeutral:I

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->btnSelectorNegative:I

    .line 19
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->titleGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->contentGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 21
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->btnStackedGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->itemsGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 23
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->buttonsGravity:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    return-void
.end method

.method public static get()Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;
    .locals 1

    const/4 v0, 0x1

    .line 4
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->get(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;

    move-result-object v0

    return-object v0
.end method

.method public static get(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->singleton:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 2
    new-instance p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;-><init>()V

    sput-object p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->singleton:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;

    .line 3
    :cond_0
    sget-object p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;->singleton:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/ThemeSingleton;

    return-object p0
.end method
