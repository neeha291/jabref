/*  Copyright (C) 2012 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/

package net.sf.jabref.imports;

/**
 * Container class for lists with keywords where the case should be kept independent of bibstyle
 * 
 */
public class CaseKeeperList {
   
    // Common words in IEEE Xplore that should always be in the given case
   public String[] wordListIEEEXplore = new String[]{
        "1-D",
        "1D",
        "2-D",
        "2D",
        "3-D",
        "3D",
        "3G",
        "3GPP",
        "4-D",
        "4D",
        "4G",
        "4H",
        "6H",
        "A/D",
	"ACM",
        "AC",
        "ADC",
        "ADI",
	"ADSL",
        "AES",
        "AFE",
        "AI",
        "AIQ",
        "ALU",
        "AMPS",
        "AM",
        "ANOVA",
        "ANSI",
        "API",
        "ARMA",
        "ARQ",
        "ASIC",
        "ATE",
	"ATM",
        "ATSC",
        "AVC",
        "AWGN",
        "Alamouti",
        "AlGaAs",
        "Altera",
        "BCD",
        "BCH",
        "BCJR",
        "BDD",
        "BER",
        "BIBO",
        "BIST",
        "BJT",
        "BLAST",
        "BPSK",
        "BP",
        "Baum",
        "Bayes",
        "Berlekamp",
        "Bessel",
        "BiCMOS",
        "Bluetooth",
        "Booth",
        "Bragg",
        "Butterworth",
        "CAD",
        "CATV",
        "CBR",
        "CDMA",
        "CDR",
        "CFAR",
        "CIC",
        "CMFB",
        "CMOS",
        "CMRR",
        "CNN",
	"CORDIC",
        "COTS",
        "CP",
        "CPE",
        "CPLD",
        "CPU",
        "CRC",
        "CSD",
        "CSE",
        "CSIT",
        "CSI",
        "CSMA",
        "Carlo",
        "Cauer",
        "Chebychev",
        "Chebyshev",
        "Chien",
        "Cooley",
        "D/A",
        "DAB",
	"DAC",
	"DCT",
        "DC",
        "DDC",
        "DDFS",
        "DDR",
        "DDSM",
        "DDS",
        "DEM",
        "DFE",
        "DFT",
        "DHT",
        "DLL",
	"DMT",
        "DNA",
        "DNL",
        "DOA",
        "DOCSIS",
        "DRAM",
        "DRM",
        "DSP",
	"DST",
        "DTMB",
        "DTTB",
        "DTV",
        "DUC",
        "DVB-C",
        "DVB-H",
        "DVB-S",
        "DVB-T",
        "DVB",
        "DVFS",
        "DVI",
        "DWT",
        "Doppler",
        "ECG",
        "ECL",
        "EDGE",
        "EEG",
        "EMC",
        "EMG",
        "EMI",
        "ENOB",
        "EPROM",
        "ESPRIT",
        "EV",
        "EVM",
        "Euclid",
        "FDE",
        "FDTD",
        "FEC",
        "FEM",
        "FER",
        "FET",
        "FFT",
        "FIFO",
	"FIR",
        "FMCW",
	"FM",
        "FP",
        "FPAA",
        "FPGA",
        "FPU",
        "FRM",
        "FTTC",
        "FTTH",
        "Farrow",
        "FinFET",
        "Fourier",
        "GALS",
        "GF",
        "GHz",
        "GIS",
        "GMD",
        "GNSS",
        "GNU",
        "GPGPU",
        "GPRS",
        "GPS",
        "GPU",
        "GSM",
        "GSPS",
        "GS",
        "GaAs",
        "Galileo",
        "Galois",
        "Gauss",
        "Gb",
        "GeV",
        "Gram-Schmidt",
        "H.264",
        "HARQ",
        "HBT",
        "HDMI",
        "HDTV",
        "HD",
        "HEMT",
        "HEVC",
        "HF",
        "HMM",
        "HPC",
        "HSPA",
        "HSDPA",
        "Haar",
        "Hadamard",
        "Hamming",
        "Hartley",
        "Hermit",  // Hermitian, Hermite, Hermit
        "Hilbert",
        "Hz",
        "I/O",
        "I/Q",
        "IBM",
        "ICA",
        "IC",
        "ICI",
        "ICT",
        "IDCT",
        "IDFT",
        "IEC",
        "IEEE",
        "IFFT",
        "IFIR",
        "IF",
        "IGBT",
        "II-VI",
        "II/VI",
        "III-V",
        "III/V",
        "IIR",
        "ILP",
        "IMDCT",
        "IMDST",
        "IMT-A", // IMT-Advanced
        "INL",
        "IO",
        "IPTV",
        "IP",
        "IQ",
        "IS-95",
        "ISDN",
        "ISI",
        "ISM",
        "ISO",
        "InP",
        "JFET",
        "JPEG",
        "JTAG",
        "Josephson",
        "Kalman",
        "Karatsuba",
        "LAN",
        "LCD",
        "LDA",
        "LDD",
        "LDI",
        "LDPC",
        "LED",
        "LFSR",
        "LLR",
        "LMDS",
        "LMS",
        "LNA",
        "LNS",
        "LSB",
        "LTE-A",
        "LTE",
        "LTI",
        "LVDC",
        "LVDS",
        "LZW",
        "Laplace",
        "Lempel",
        "Lyapunov",
        "MAC",
        "MANET",
        "MAP",
        "MASH",
        "MC",
        "MCM",
        "MCU",
        "MDCT",
        "MDST",
        "MEMS",
        "MESFET",
        "MHz",
        "MILP",
        "MIMO",
        "MISO",
        "ML",
        "MMIC",
        "MMSE",
        "MOSFET",
        "MOS",
        "MP3",
        "MPEG",
        "MPSoC",
        "MRC",
        "MRI",
        "MSB",
        "MSD",
        "MSE",
        "MSPS",
        "MS",
        "MTCMOS",
        "MTD",
        "MTI",
        "Manchester",
        "Markov",
        "Massey",
        "Maxwell",
        "Mb",
        "McClellan",
        "MeV",
        "Miller",
        "Monte",
        "Montgomery",
        "Msps",
        "NMOS",
        "NTSC",
        "Newton",
        "NoC",
        "Nyquist",
        "OFDMA",
        "OFDM",
        "OSR",
        "OTA-C",
        "OTA",
        "P2P",
        "PAL",
        "PAM",
        "PAPR",
        "PCA",
        "PCI",
        "PCM",
        "PC",
        "PFA",
        "PHY",
        "PID",
        "PLC",
        "PLL",
        "PMOS",
        "PN",
        "PON",
        "POTS",
        "PSNR",
        "PSRR",
        "PWM",
        "Parks-McClellan",  // Only Parks will give lots of incorrect hits
        "PowerPC",
        "QAM",
        "QC-LDPC",
        "QNN",
        "QO",
        "QP",
        "QPSK",
        "QR",
        "QRD",
        "QoS",
        "RAD",
        "RAKE",
        "RAM",
        "RC",
        "RCS",
        "RFDAC",
        "RFE",
        "RFIC",
        "RFID",
        "RF",
        "RISC",
        "RLC",
        "RLS",
        "RMS",
        "RNS",
        "ROM",
        "RRC",
        "RS",
        "RSA",
        "RTOS",
        "RX",
        "Rayleigh",
        "Reed",
        "Remez",
        "SAR",
        "SAW",
        "SC",
        "SDF",
        "SDH",
        "SDRAM",
        "SDR",
        "SFDR",
        "SIC",
        "SIMD",
        "SIMO",
        "SINAD",
        "SINR",
        "SISO",
        "SNDR",
        "SNR",
        "SOI",
        "SONET",
        "SPT",
        "SRAM",
        "SQNR",
        "STBC",
        "SVD",
        "SVM",
        "SerDes",
        "Shannon",
        "SiC",
        "SiGe",
        "SoC",
        "Solomon",
        "SystemC",
        "TCP",
        "TDM",
        "TDMA",
        "TDS",
        "TETRA",
        "TFT",
        "THD",
        "THz",
        "TPG",
        "TSPC",
        "TV",
        "TX",
        "Toeplitz",
        "Tukey",
        "UAV",
        "UHF",
        "ULSI",
        "UMTS",
        "USRP",
        "UWB",
        "V-BLAST",
        "VBLAST",
        "VBR",
        "VCO",
        "VDD",
        "VDSL",
        "VGA",
        "VHDL",
        "VHF",
        "VLIW",
        "VLSI",
        "VOD",
        "VQ",
        "VSB",
        "Vdd",
        "Verilog-AMS",
        "Verilog-A",
        "Verilog",
        "Viterbi",
        "VoD",
        "VoIP",
        "Volterra",
        "WCDMA",
        "WDF",
        "WDM",
        "WFTA",
        "WLAN",
        "WPAN",
        "WWW",
        "Wallace",
        "Watt",
        "Welch",
        "WiMAX",
        "Winograd",
        "XML",
        "Xilinx",
        "ZF",
        "ZigBee",
        "Ziv",
        "dB",
        "eV",
        "keV",
        "kHz",
        "kS",
        "kV",
        "kW",
        "mA",
        "mJ",
        "mW",
        "mV",
        "nJ",
        "nV",
        "nW",
        "pJ",
        "pV",
        "pW",
        "xDSL"
   };
    
   
   // List of all keyword lists
   private String[][] allLists = new String[][] {
       wordListIEEEXplore
   };
   
   public CaseKeeperList () {
   
   };
   /* Return all lists concatenated
    * Can be done faster once deciding on Java 6.0
    * see: http://stackoverflow.com/questions/80476/how-to-concatenate-two-arrays-in-java
    */
    public String[] getAll() {
        int lengh = 0;
        for (String[] array : allLists) {
            lengh += array.length;
        }
        String[] result = new String[lengh];
        int pos = 0;
        for (String[] array : allLists) {
            for (String element : array) {
                result[pos] = element;
                pos++;
            }
        }
        return result;
    }
}
