.class public final Lcom/dylanc/longan/Logger$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dylanc/longan/Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field public static final synthetic a:Lcom/dylanc/longan/Logger$Companion;

.field public static b:Lkotlin/jvm/functions/Function2;

.field public static c:Lf1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/dylanc/longan/Logger$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/dylanc/longan/Logger$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/dylanc/longan/Logger$Companion;->a:Lcom/dylanc/longan/Logger$Companion;

    .line 7
    .line 8
    sget-object v0, Lcom/dylanc/longan/Logger$Companion$isLoggable$1;->a:Lcom/dylanc/longan/Logger$Companion$isLoggable$1;

    .line 9
    .line 10
    sput-object v0, Lcom/dylanc/longan/Logger$Companion;->b:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    new-instance v0, Lf1/f;

    .line 13
    .line 14
    invoke-direct {v0}, Lf1/f;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/dylanc/longan/Logger$Companion;->c:Lf1/e;

    .line 18
    .line 19
    return-void
.end method

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
.method public final a()Lf1/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/dylanc/longan/Logger$Companion;->c:Lf1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    sget-object v0, Lcom/dylanc/longan/Logger$Companion;->b:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method
