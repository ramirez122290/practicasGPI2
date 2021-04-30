/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package simple;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest 
{static class __CLR4_4_144knoxtcnk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0061\u006c\u0075\u006d\u006e\u006f\u002f\u0045\u0073\u0063\u0072\u0069\u0074\u006f\u0072\u0069\u006f\u002f\u0070\u0072\u0061\u0063\u0074\u0069\u0063\u0061\u0073\u0047\u0050\u0049\u0032\u002f\u0050\u0072\u0061\u0063\u0074\u0069\u0063\u0061\u0073\u0020\u0033\u0020\u0079\u0020\u0034\u002f\u0073\u0069\u006d\u0070\u006c\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1618857260619L,8589935092L,15,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){__CLR4_4_144knoxtcnk.R.globalSliceStart(getClass().getName(),4);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlb7uc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144knoxtcnk.R.rethrow($CLV_t2$);}finally{__CLR4_4_144knoxtcnk.R.globalSliceEnd(getClass().getName(),"simple.AppTest.shouldAnswerWithTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlb7uc4(){try{__CLR4_4_144knoxtcnk.R.inc(4);
        __CLR4_4_144knoxtcnk.R.inc(5);assertTrue( true );
    }finally{__CLR4_4_144knoxtcnk.R.flushNeeded();}}
    
    @Test
	public void stringOutputTest() {__CLR4_4_144knoxtcnk.R.globalSliceStart(getClass().getName(),6);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nn28l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144knoxtcnk.R.rethrow($CLV_t2$);}finally{__CLR4_4_144knoxtcnk.R.globalSliceEnd(getClass().getName(),"simple.AppTest.stringOutputTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nn28l6(){try{__CLR4_4_144knoxtcnk.R.inc(6);
		// Preparo los streams
		__CLR4_4_144knoxtcnk.R.inc(7);final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		__CLR4_4_144knoxtcnk.R.inc(8);final PrintStream originalOut = System.out;
		__CLR4_4_144knoxtcnk.R.inc(9);System.setOut(new PrintStream(outContent));
		// Lanzo la funcion a probar
		__CLR4_4_144knoxtcnk.R.inc(10);App aplicacion = new App();
		__CLR4_4_144knoxtcnk.R.inc(11);aplicacion.print();
		__CLR4_4_144knoxtcnk.R.inc(12);String salida = outContent.toString();
		// Vuevlo a dejar los streams como estaban
		__CLR4_4_144knoxtcnk.R.inc(13);System.setOut(originalOut);
		// Compruebo salida
		__CLR4_4_144knoxtcnk.R.inc(14);assertEquals("lala", salida);
	}finally{__CLR4_4_144knoxtcnk.R.flushNeeded();}}
}
