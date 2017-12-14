package com.example.examplemod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Example Modクラス
 *
 * Modアノテーションを付けるだけで、Modクラスとして認識させる。
 * クラス名は自由に決めることが出来、他のクラスを継承する必要もない。
 * なお、Modアノテーションの必須項目はmodidのみで、その他は外部ファイルから設定することが出来、
 * 省略することが出来る。
 *
 * また、NetworkModは不要であれば省略しても良い。
 */
@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.MOD_NAME)
public class ExampleMod
{
    public static final String MOD_ID = "sample_mod";
    public static final String MOD_NAME = "sampleMod";


    /**
     * 初期化前処理。
     * メソッド名は何でも良い。 不要であれば省略可能。
     *
     * @param event　FMLの初期化処理イベント
     */
    @EventHandler
    public void preInit(FMLInitializationEvent event) {
        // 初期化前処理
        // 設定ロードや GameRegistory への登録を行うタイミング
        // 追加Blockや追加Itemはこのタイミングで登録を行う
    }

    /**
     * 初期化処理
     * メソッド名は何でも良い。 不要であれば省略可能。
     *
     * @param event FMLの初期化イベント
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 初期化処理
        // Modのセットアップや、他Modとの連携処理を行うタイミング
    }
}

/**
 * 基本的に、前処理で設定の読み込み、及び追加するBlock、Itemのインスタンス生成及び登録を行う。
 * 初期化処理でそれ以外の初期化処理を行う。
 * 殆どのModでは、初期化前処理と初期化処理の2つだけで事足りると思われる。
 *
 * なお、コンストラクタでは、自身の内部変更のみを行い、FMLや他Modへの鑑賞は行うべきではない。
 * これは、インスタンスが生成されるタイミングでは、他Modのロードや生成が保証されていない為。
 * 基本的にはコンストラクタは定義せず、デフォルトのコンストラクタが使用されるようにする方が良い。
 */
