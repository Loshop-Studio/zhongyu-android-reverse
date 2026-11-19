.class public La/h/j/z$i;
.super La/h/j/z$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# static fields
.field public static final r:La/h/j/z;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, La/h/j/z;->i(Landroid/view/WindowInsets;)La/h/j/z;

    move-result-object v0

    sput-object v0, La/h/j/z$i;->r:La/h/j/z;

    return-void
.end method

.method public constructor <init>(La/h/j/z;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/h/j/z$h;-><init>(La/h/j/z;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method
